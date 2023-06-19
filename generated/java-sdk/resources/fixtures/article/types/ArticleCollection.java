package resources.fixtures.article.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(
    builder = ArticleCollection.Builder.class
)
public final class ArticleCollection {
  private final List<Article> items;

  private final int total;

  private final int offset;

  private final int limit;

  private int _cachedHashCode;

  ArticleCollection(List<Article> items, int total, int offset, int limit) {
    this.items = items;
    this.total = total;
    this.offset = offset;
    this.limit = limit;
  }

  @JsonProperty("items")
  public List<Article> getItems() {
    return items;
  }

  @JsonProperty("total")
  public int getTotal() {
    return total;
  }

  @JsonProperty("offset")
  public int getOffset() {
    return offset;
  }

  @JsonProperty("limit")
  public int getLimit() {
    return limit;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ArticleCollection && equalTo((ArticleCollection) other);
  }

  private boolean equalTo(ArticleCollection other) {
    return items.equals(other.items) && total == other.total && offset == other.offset && limit == other.limit;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.items, this.total, this.offset, this.limit);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ArticleCollection{" + "items: " + items + ", total: " + total + ", offset: " + offset + ", limit: " + limit + "}";
  }

  public static TotalStage builder() {
    return new Builder();
  }

  public interface TotalStage {
    OffsetStage total(int total);

    Builder from(ArticleCollection other);
  }

  public interface OffsetStage {
    LimitStage offset(int offset);
  }

  public interface LimitStage {
    _FinalStage limit(int limit);
  }

  public interface _FinalStage {
    ArticleCollection build();

    _FinalStage items(List<Article> items);

    _FinalStage addItems(Article items);

    _FinalStage addAllItems(List<Article> items);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TotalStage, OffsetStage, LimitStage, _FinalStage {
    private int total;

    private int offset;

    private int limit;

    private List<Article> items = new ArrayList<>();

    private Builder() {
    }

    @Override
    public Builder from(ArticleCollection other) {
      items(other.getItems());
      total(other.getTotal());
      offset(other.getOffset());
      limit(other.getLimit());
      return this;
    }

    @Override
    @JsonSetter("total")
    public OffsetStage total(int total) {
      this.total = total;
      return this;
    }

    @Override
    @JsonSetter("offset")
    public LimitStage offset(int offset) {
      this.offset = offset;
      return this;
    }

    @Override
    @JsonSetter("limit")
    public _FinalStage limit(int limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public _FinalStage addAllItems(List<Article> items) {
      this.items.addAll(items);
      return this;
    }

    @Override
    public _FinalStage addItems(Article items) {
      this.items.add(items);
      return this;
    }

    @Override
    @JsonSetter(
        value = "items",
        nulls = Nulls.SKIP
    )
    public _FinalStage items(List<Article> items) {
      this.items.clear();
      this.items.addAll(items);
      return this;
    }

    @Override
    public ArticleCollection build() {
      return new ArticleCollection(items, total, offset, limit);
    }
  }
}
