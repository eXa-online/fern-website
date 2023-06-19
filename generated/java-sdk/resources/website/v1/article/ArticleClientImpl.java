package resources.website.v1.article;

import core.ClientOptions;
import core.ObjectMappers;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import resources.fixtures.article.types.Article;
import resources.fixtures.article.types.ArticleCollection;
import resources.fixtures.article.types.ArticleSlug;
import resources.fixtures.article.types.CreatArticleRequest;

public final class ArticleClientImpl implements ArticleClient {
  private final ClientOptions clientOptions;

  public ArticleClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public ArticleCollection getArticles() {
    Request _request = new Request.Builder()
      .url(HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegments("articles")

        .build())
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ArticleCollection.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Article getArticle(ArticleSlug slug) {
    Request _request = new Request.Builder()
      .url(HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegments("articles")

        .addPathSegment(slug.toString())
        .build())
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Article.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public ArticleSlug createArticle(CreatArticleRequest request) {
    RequestBody _requestBody;
    try {
      _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
    }
    catch(Exception e) {
      throw new RuntimeException(e);
    }
    Request _request = new Request.Builder()
      .url(HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegments("articles")

        .build())
      .method("POST", _requestBody)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ArticleSlug.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
