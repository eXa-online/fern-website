package resources.website.v1;

import resources.website.v1.article.ArticleClient;
import resources.website.v1.blogpost.BlogpostClient;

public interface V1Client {
  ArticleClient article();

  BlogpostClient blogpost();
}
