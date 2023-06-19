import resources.website.WebsiteClient;

public interface ExaOnline.deFernWebsiteClient {
  WebsiteClient website();

  static ExaOnline.deFernWebsiteClientBuilder builder() {
    return new ExaOnline.deFernWebsiteClientBuilder();
  }
}
