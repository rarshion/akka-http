/*
 * Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package docs.http.javadsl.server;

import akka.actor.ActorSystem;
import com.typesafe.sslconfig.akka.AkkaSSLConfig;
import org.junit.Test;
import org.scalatestplus.junit.JUnitSuite;

/* COMPILE ONLY TEST */
public class HttpsServerExampleTest extends JUnitSuite {

  @Test
  public void compileOnlySpec() throws Exception {
    // just making sure for it to be really compiled / run even if empty
  }

  void sslConfigGet() {
    //#akka-ssl-config
    final ActorSystem system = ActorSystem.create();

    final AkkaSSLConfig sslConfig = AkkaSSLConfig.get(system);
    //#akka-ssl-config
  }
}
