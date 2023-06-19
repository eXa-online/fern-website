package resources.fixtures.blogpost.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CreateBlogPostRequest.Builder.class
)
public final class CreateBlogPostRequest {
  private final BlogPostSlug slug;

  private final String title;

  private final String author;

  private final Optional<String> image;

  private final Optional<String> publicationeDate;

  private final Optional<String> richtext;

  private int _cachedHashCode;

  CreateBlogPostRequest(BlogPostSlug slug, String title, String author, Optional<String> image,
      Optional<String> publicationeDate, Optional<String> richtext) {
    this.slug = slug;
    this.title = title;
    this.author = author;
    this.image = image;
    this.publicationeDate = publicationeDate;
    this.richtext = richtext;
  }

  @JsonProperty("slug")
  public BlogPostSlug getSlug() {
    return slug;
  }

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  @JsonProperty("image")
  public Optional<String> getImage() {
    return image;
  }

  @JsonProperty("publicatione-date")
  public Optional<String> getPublicationeDate() {
    return publicationeDate;
  }

  @JsonProperty("richtext")
  public Optional<String> getRichtext() {
    return richtext;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreateBlogPostRequest && equalTo((CreateBlogPostRequest) other);
  }

  private boolean equalTo(CreateBlogPostRequest other) {
    return slug.equals(other.slug) && title.equals(other.title) && author.equals(other.author) && image.equals(other.image) && publicationeDate.equals(other.publicationeDate) && richtext.equals(other.richtext);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.slug, this.title, this.author, this.image, this.publicationeDate, this.richtext);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreateBlogPostRequest{" + "slug: " + slug + ", title: " + title + ", author: " + author + ", image: " + image + ", publicationeDate: " + publicationeDate + ", richtext: " + richtext + "}";
  }

  public static SlugStage builder() {
    return new Builder();
  }

  public interface SlugStage {
    TitleStage slug(BlogPostSlug slug);

    Builder from(CreateBlogPostRequest other);
  }

  public interface TitleStage {
    AuthorStage title(String title);
  }

  public interface AuthorStage {
    _FinalStage author(String author);
  }

  public interface _FinalStage {
    CreateBlogPostRequest build();

    _FinalStage image(Optional<String> image);

    _FinalStage image(String image);

    _FinalStage publicationeDate(Optional<String> publicationeDate);

    _FinalStage publicationeDate(String publicationeDate);

    _FinalStage richtext(Optional<String> richtext);

    _FinalStage richtext(String richtext);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements SlugStage, TitleStage, AuthorStage, _FinalStage {
    private BlogPostSlug slug;

    private String title;

    private String author;

    private Optional<String> richtext = Optional.empty();

    private Optional<String> publicationeDate = Optional.empty();

    private Optional<String> image = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(CreateBlogPostRequest other) {
      slug(other.getSlug());
      title(other.getTitle());
      author(other.getAuthor());
      image(other.getImage());
      publicationeDate(other.getPublicationeDate());
      richtext(other.getRichtext());
      return this;
    }

    @Override
    @JsonSetter("slug")
    public TitleStage slug(BlogPostSlug slug) {
      this.slug = slug;
      return this;
    }

    @Override
    @JsonSetter("title")
    public AuthorStage title(String title) {
      this.title = title;
      return this;
    }

    @Override
    @JsonSetter("author")
    public _FinalStage author(String author) {
      this.author = author;
      return this;
    }

    @Override
    public _FinalStage richtext(String richtext) {
      this.richtext = Optional.of(richtext);
      return this;
    }

    @Override
    @JsonSetter(
        value = "richtext",
        nulls = Nulls.SKIP
    )
    public _FinalStage richtext(Optional<String> richtext) {
      this.richtext = richtext;
      return this;
    }

    @Override
    public _FinalStage publicationeDate(String publicationeDate) {
      this.publicationeDate = Optional.of(publicationeDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "publicatione-date",
        nulls = Nulls.SKIP
    )
    public _FinalStage publicationeDate(Optional<String> publicationeDate) {
      this.publicationeDate = publicationeDate;
      return this;
    }

    @Override
    public _FinalStage image(String image) {
      this.image = Optional.of(image);
      return this;
    }

    @Override
    @JsonSetter(
        value = "image",
        nulls = Nulls.SKIP
    )
    public _FinalStage image(Optional<String> image) {
      this.image = image;
      return this;
    }

    @Override
    public CreateBlogPostRequest build() {
      return new CreateBlogPostRequest(slug, title, author, image, publicationeDate, richtext);
    }
  }
}
