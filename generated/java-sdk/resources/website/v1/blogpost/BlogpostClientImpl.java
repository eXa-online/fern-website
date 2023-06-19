package resources.website.v1.blogpost;

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
import resources.fixtures.blogpost.types.BlogPost;
import resources.fixtures.blogpost.types.BlogPostCollection;
import resources.fixtures.blogpost.types.BlogPostSlug;
import resources.fixtures.blogpost.types.CreateBlogPostRequest;

public final class BlogpostClientImpl implements BlogpostClient {
  private final ClientOptions clientOptions;

  public BlogpostClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public BlogPostCollection getBlogposts() {
    Request _request = new Request.Builder()
      .url(HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegments("blog")

        .build())
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), BlogPostCollection.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public BlogPost getBlogPost(BlogPostSlug slug) {
    Request _request = new Request.Builder()
      .url(HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegments("blog")

        .addPathSegment(slug.toString())
        .build())
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), BlogPost.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public BlogPostSlug createBlogPost(CreateBlogPostRequest request) {
    RequestBody _requestBody;
    try {
      _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
    }
    catch(Exception e) {
      throw new RuntimeException(e);
    }
    Request _request = new Request.Builder()
      .url(HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegments("blog")

        .build())
      .method("POST", _requestBody)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), BlogPostSlug.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
