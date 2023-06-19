package resources.website.v1.article;

import resources.fixtures.article.types.Article;
import resources.fixtures.article.types.ArticleCollection;
import resources.fixtures.article.types.ArticleSlug;
import resources.fixtures.article.types.CreatArticleRequest;

public interface ArticleClient {
  ArticleCollection getArticles();

  Article getArticle(ArticleSlug slug);

  ArticleSlug createArticle(CreatArticleRequest request);
}
