package resources.fixtures.article.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public final class ArticleSlug {
  private final String value;

  private ArticleSlug(String value) {
    this.value = value;
  }

  @JsonValue
  public String get() {
    return this.value;
  }

  @Override
  public boolean equals(Object other) {
    return this == other || (other instanceof ArticleSlug && this.value.equals(((ArticleSlug) other).value));
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
  public static ArticleSlug of(String value) {
    return new ArticleSlug(value);
  }

  public static ArticleSlug valueOf(String value) {
    return of(value);
  }
}
