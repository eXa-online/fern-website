package resources.website;

import core.ClientOptions;
import core.Suppliers;
import java.lang.Override;
import java.util.function.Supplier;
import resources.website.v1.V1Client;
import resources.website.v1.V1ClientImpl;

public final class WebsiteClientImpl implements WebsiteClient {
  private final ClientOptions clientOptions;

  private final Supplier<V1Client> v1Client;

  public WebsiteClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
    this.v1Client = Suppliers.memoize(() -> new V1ClientImpl(clientOptions));
  }

  @Override
  public V1Client v1() {
    return this.v1Client.get();
  }
}
