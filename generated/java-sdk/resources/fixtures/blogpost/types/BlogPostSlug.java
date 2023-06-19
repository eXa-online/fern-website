package resources.fixtures.blogpost.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public final class BlogPostSlug {
  private final String value;

  private BlogPostSlug(String value) {
    this.value = value;
  }

  @JsonValue
  public String get() {
    return this.value;
  }

  @Override
  public boolean equals(Object other) {
    return this == other || (other instanceof BlogPostSlug && this.value.equals(((BlogPostSlug) other).value));
  }

  @Override
  public int hashCode() {
    return value.hashCode();
  }

  @Override
  public String toString() {
    return value;
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static BlogPostSlug of(String value) {
    return new BlogPostSlug(value);
  }

  public static BlogPostSlug valueOf(String value) {
    return of(value);
  }
}
