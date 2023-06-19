import core.ClientOptions;
import core.Suppliers;
import java.lang.Override;
import java.util.function.Supplier;
import resources.website.WebsiteClient;
import resources.website.WebsiteClientImpl;

public final class ExaOnline.deFernWebsiteClientImpl implements ExaOnline.deFernWebsiteClient {
  private final ClientOptions clientOptions;

  private final Supplier<WebsiteClient> websiteClient;

  public ExaOnline.deFernWebsiteClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
    this.websiteClient = Suppliers.memoize(() -> new WebsiteClientImpl(clientOptions));
  }

  @Override
  public WebsiteClient website() {
    return this.websiteClient.get();
  }
}
