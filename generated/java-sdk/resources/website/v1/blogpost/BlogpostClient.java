package resources.website.v1.blogpost;

import resources.fixtures.blogpost.types.BlogPost;
import resources.fixtures.blogpost.types.BlogPostCollection;
import resources.fixtures.blogpost.types.BlogPostSlug;
import resources.fixtures.blogpost.types.CreateBlogPostRequest;

public interface BlogpostClient {
  BlogPostCollection getBlogposts();

  BlogPost getBlogPost(BlogPostSlug slug);

  BlogPostSlug createBlogPost(CreateBlogPostRequest request);
}
