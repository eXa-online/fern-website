package resources.website.v1;

import core.ClientOptions;
import core.Suppliers;
import java.lang.Override;
import java.util.function.Supplier;
import resources.website.v1.article.ArticleClient;
import resources.website.v1.article.ArticleClientImpl;
import resources.website.v1.blogpost.BlogpostClient;
import resources.website.v1.blogpost.BlogpostClientImpl;

public final class V1ClientImpl implements V1Client {
  private final ClientOptions clientOptions;

  private final Supplier<ArticleClient> articleClient;

  private final Supplier<BlogpostClient> blogpostClient;

  public V1ClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
    this.articleClient = Suppliers.memoize(() -> new ArticleClientImpl(clientOptions));
    this.blogpostClient = Suppliers.memoize(() -> new BlogpostClientImpl(clientOptions));
  }

  @Override
  public ArticleClient article() {
    return this.articleClient.get();
  }

  @Override
  public BlogpostClient blogpost() {
    return this.blogpostClient.get();
  }
}
