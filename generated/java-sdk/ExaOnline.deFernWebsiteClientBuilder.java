import core.ClientOptions;
import core.Environment;
import java.lang.String;
import java.util.Base64;

public final class ExaOnline.deFernWebsiteClientBuilder {
  private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

  private Environment environment;

  public ExaOnline.deFernWebsiteClientBuilder credentials(String username, String password) {
    String unencodedToken = username + ":" + password;
    String encodedToken = Base64.getEncoder().encodeToString(unencodedToken.getBytes());
    this.clientOptionsBuilder.addHeader("Authorization", "Basic " + encodedToken);
    return this;
  }

  public ExaOnline.deFernWebsiteClientBuilder url(String url) {
    this.environment = Environment.custom(url);
    return this;
  }

  public ExaOnline.deFernWebsiteClient build() {
    clientOptionsBuilder.environment(this.environment);
    return new ExaOnline.deFernWebsiteClientImpl(clientOptionsBuilder.build());
  }
}
