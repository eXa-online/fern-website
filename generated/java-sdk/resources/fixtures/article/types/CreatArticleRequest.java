package resources.fixtures.article.types;

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
    builder = CreatArticleRequest.Builder.class
)
public final class CreatArticleRequest {
  private final ArticleSlug slug;

  private final String title;

  private final Optional<String> image;

  private final Optional<String> publicationeDate;

  private final Optional<String> richtext;

  private int _cachedHashCode;

  CreatArticleRequest(ArticleSlug slug, String title, Optional<String> image,
      Optional<String> publicationeDate, Optional<String> richtext) {
    this.slug = slug;
    this.title = title;
    this.image = image;
    this.publicationeDate = publicationeDate;
    this.richtext = richtext;
  }

  @JsonProperty("slug")
  public ArticleSlug getSlug() {
    return slug;
  }

  @JsonProperty("title")
  public String getTitle() {
    return title;
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
    return other instanceof CreatArticleRequest && equalTo((CreatArticleRequest) other);
  }

  private boolean equalTo(CreatArticleRequest other) {
    return slug.equals(other.slug) && title.equals(other.title) && image.equals(other.image) && publicationeDate.equals(other.publicationeDate) && richtext.equals(other.richtext);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.slug, this.title, this.image, this.publicationeDate, this.richtext);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreatArticleRequest{" + "slug: " + slug + ", title: " + title + ", image: " + image + ", publicationeDate: " + publicationeDate + ", richtext: " + richtext + "}";
  }

  public static SlugStage builder() {
    return new Builder();
  }

  public interface SlugStage {
    TitleStage slug(ArticleSlug slug);

    Builder from(CreatArticleRequest other);
  }

  public interface TitleStage {
    _FinalStage title(String title);
  }

  public interface _FinalStage {
    CreatArticleRequest build();

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
  public static final class Builder implements SlugStage, TitleStage, _FinalStage {
    private ArticleSlug slug;

    private String title;

    private Optional<String> richtext = Optional.empty();

    private Optional<String> publicationeDate = Optional.empty();

    private Optional<String> image = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(CreatArticleRequest other) {
      slug(other.getSlug());
      title(other.getTitle());
      image(other.getImage());
      publicationeDate(other.getPublicationeDate());
      richtext(other.getRichtext());
      return this;
    }

    @Override
    @JsonSetter("slug")
    public TitleStage slug(ArticleSlug slug) {
      this.slug = slug;
      return this;
    }

    @Override
    @JsonSetter("title")
    public _FinalStage title(String title) {
      this.title = title;
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
    public CreatArticleRequest build() {
      return new CreatArticleRequest(slug, title, image, publicationeDate, richtext);
    }
  }
}
