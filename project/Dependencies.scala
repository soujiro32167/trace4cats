import sbt._

object Dependencies {
  object Versions {
    val cats = "2.6.0"
    val catsEffect = "2.5.0"
    val collectionCompat = "2.4.3"
    val commonsCodec = "1.15"
    val circe = "0.13.0"
    val circeYaml = "0.13.1"
    val decline = "1.4.0"
    val embeddedRedis = "0.7.3"
    val enumeratum = "1.6.1"
    val fs2 = "2.5.5"
    val fs2Kafka = "1.6.1"
    val googleCredentials = "0.25.5"
    val googleCloudTrace = "1.3.3"
    val grpc = "1.37.0"
    val http4s = "0.21.22"
    val http4sJdkClient = "0.3.6"
    val jaeger = "1.6.0"
    val jwt = "3.15.0"
    val kafka = "2.8.0"
    val kittens = "2.3.0"
    val log4cats = "1.3.0"
    val logback = "1.2.3"
    val micronaut = "2.5.1"
    val natchez = "0.0.24"
    val openTelemetry = "1.1.0"
    val redis4cats = "0.13.1"
    val scaffeine = "4.0.2"
    val scala212 = "2.12.13"
    val scala213 = "2.13.5"
    val scalapb = "0.11.0"
    val sttpClient2 = "2.2.9"
    val sttpClient3 = "3.2.3"
    val sttpModel = "1.4.6"
    val sttpTapir = "0.17.19"
    val svm = "19.2.1"
    val vulcan = "1.6.0"
    val zioInterop = "2.4.1.0"

    val catsTestkitScalatest = "2.1.4"
    val disciplineScalatest = "2.1.4"
    val discipline = "1.1.4"
    val scalaCheck = "1.15.4"
    val scalaCheckShapeless = "1.2.5"
    val scalaTest = "3.2.8"
    val testContainers = "0.39.3"
  }

  lazy val cats = "org.typelevel"                              %% "cats-core"                       % Versions.cats
  lazy val catsEffect = "org.typelevel"                        %% "cats-effect"                     % Versions.catsEffect
  lazy val commonsCodec = "commons-codec"                       % "commons-codec"                   % Versions.commonsCodec
  lazy val collectionCompat = "org.scala-lang.modules"         %% "scala-collection-compat"         % Versions.collectionCompat
  lazy val circeGeneric = "io.circe"                           %% "circe-generic-extras"            % Versions.circe
  lazy val circeParser = "io.circe"                            %% "circe-parser"                    % Versions.circe
  lazy val circeYaml = "io.circe"                              %% "circe-yaml"                      % Versions.circeYaml
  lazy val embeddedKafka = "io.github.embeddedkafka"           %% "embedded-kafka"                  % Versions.kafka
  lazy val embeddedRedis = "it.ozimov"                          % "embedded-redis"                  % Versions.embeddedRedis
  lazy val enumeratum = "com.beachape"                         %% "enumeratum"                      % Versions.enumeratum
  lazy val enumeratumCats = "com.beachape"                     %% "enumeratum-cats"                 % Versions.enumeratum
  lazy val enumeratumCirce = "com.beachape"                    %% "enumeratum-circe"                % Versions.enumeratum
  lazy val declineEffect = "com.monovore"                      %% "decline-effect"                  % Versions.decline
  lazy val googleCredentials = "com.google.auth"                % "google-auth-library-credentials" % Versions.googleCredentials
  lazy val googleCloudTrace = "com.google.cloud"                % "google-cloud-trace"              % Versions.googleCloudTrace
  lazy val fs2 = "co.fs2"                                      %% "fs2-core"                        % Versions.fs2
  lazy val fs2Io = "co.fs2"                                    %% "fs2-io"                          % Versions.fs2
  lazy val fs2Kafka = "com.github.fd4s"                        %% "fs2-kafka"                       % Versions.fs2Kafka
  lazy val grpcOkHttp = "io.grpc"                               % "grpc-okhttp"                     % Versions.grpc
  lazy val grpcApi = "io.grpc"                                  % "grpc-api"                        % Versions.grpc
  lazy val http4sClient = "org.http4s"                         %% "http4s-client"                   % Versions.http4s
  lazy val http4sCirce = "org.http4s"                          %% "http4s-circe"                    % Versions.http4s
  lazy val http4sCore = "org.http4s"                           %% "http4s-core"                     % Versions.http4s
  lazy val http4sDsl = "org.http4s"                            %% "http4s-dsl"                      % Versions.http4s
  lazy val http4sBlazeClient = "org.http4s"                    %% "http4s-blaze-client"             % Versions.http4s
  lazy val http4sBlazeServer = "org.http4s"                    %% "http4s-blaze-server"             % Versions.http4s
  lazy val http4sJdkClient = "org.http4s"                      %% "http4s-jdk-http-client"          % Versions.http4sJdkClient
  lazy val http4sServer = "org.http4s"                         %% "http4s-server"                   % Versions.http4s
  lazy val jaegerThrift = "io.jaegertracing"                    % "jaeger-thrift"                   % Versions.jaeger
  lazy val jwt = "com.auth0"                                    % "java-jwt"                        % Versions.jwt
  lazy val kafka = "org.apache.kafka"                           % "kafka-clients"                   % Versions.kafka
  lazy val kittens = "org.typelevel"                           %% "kittens"                         % Versions.kittens
  lazy val log4cats = "org.typelevel"                          %% "log4cats-slf4j"                  % Versions.log4cats
  lazy val logback = "ch.qos.logback"                           % "logback-classic"                 % Versions.logback
  lazy val micronautCore = "io.micronaut"                       % "micronaut-core"                  % Versions.micronaut
  lazy val natchez = "org.tpolecat"                            %% "natchez-core"                    % Versions.natchez
  lazy val openTelemetrySdk = "io.opentelemetry"                % "opentelemetry-sdk"               % Versions.openTelemetry
  lazy val openTelemetryOtlpExporter = "io.opentelemetry"       % "opentelemetry-exporter-otlp"     % Versions.openTelemetry
  lazy val openTelemetryJaegerExporter = "io.opentelemetry"     % "opentelemetry-exporter-jaeger"   % Versions.openTelemetry
  lazy val openTelemetryProto = "io.opentelemetry"              % "opentelemetry-proto"             % Versions.openTelemetry.concat("-alpha")
  lazy val redis4cats = "dev.profunktor"                       %% "redis4cats-effects"              % Versions.redis4cats
  lazy val redis4catsLog4cats = "dev.profunktor"               %% "redis4cats-log4cats"             % Versions.redis4cats
  lazy val scaffeine = "com.github.blemale"                    %% "scaffeine"                       % Versions.scaffeine
  lazy val scalapbJson = "com.thesamet.scalapb"                %% "scalapb-json4s"                  % Versions.scalapb
  lazy val sttpClient2 = "com.softwaremill.sttp.client"        %% "cats"                            % Versions.sttpClient2
  lazy val sttpClient2Http4s = "com.softwaremill.sttp.client"  %% "http4s-backend"                  % Versions.sttpClient2
  lazy val sttpClient3 = "com.softwaremill.sttp.client3"       %% "cats"                            % Versions.sttpClient3
  lazy val sttpClient3Http4s = "com.softwaremill.sttp.client3" %% "http4s-backend"                  % Versions.sttpClient3
  lazy val sttpModel = "com.softwaremill.sttp.model"           %% "core"                            % Versions.sttpModel
  lazy val sttpTapir = "com.softwaremill.sttp.tapir"           %% "tapir-cats"                      % Versions.sttpTapir
  lazy val sttpTapirJsonCirce = "com.softwaremill.sttp.tapir"  %% "tapir-json-circe"                % Versions.sttpTapir
  lazy val sttpTapirHttp4s = "com.softwaremill.sttp.tapir"     %% "tapir-http4s-server"             % Versions.sttpTapir
  lazy val svm = "com.oracle.substratevm"                       % "svm"                             % Versions.svm % "provided"
  lazy val vulcan = "com.github.fd4s"                          %% "vulcan"                          % Versions.vulcan
  lazy val vulcanGeneric = "com.github.fd4s"                   %% "vulcan-generic"                  % Versions.vulcan
  lazy val vulcanEnumeratum = "com.github.fd4s"                %% "vulcan-enumeratum"               % Versions.vulcan
  lazy val zioInterop = "dev.zio"                              %% "zio-interop-cats"                % Versions.zioInterop

  lazy val catsLaws = "org.typelevel"             %% "cats-laws"              % Versions.cats
  lazy val catsEffectLaws = "org.typelevel"       %% "cats-effect-laws"       % Versions.catsEffect
  lazy val catsTestkitScalatest = "org.typelevel" %% "cats-testkit-scalatest" % Versions.catsTestkitScalatest
  lazy val disciplineScalatest = "org.typelevel"  %% "discipline-scalatest"   % Versions.disciplineScalatest
  lazy val disciplineCore = "org.typelevel"       %% "discipline-core"        % Versions.discipline
  lazy val scalacheck = "org.scalacheck"          %% "scalacheck"             % Versions.scalaCheck
  lazy val scalacheckShapeless =
    "com.github.alexarchambault"           %% "scalacheck-shapeless_1.14"      % Versions.scalaCheckShapeless
  lazy val scalaTest = "org.scalatest"     %% "scalatest"                      % Versions.scalaTest
  lazy val testContainers = "com.dimafeng" %% "testcontainers-scala-scalatest" % Versions.testContainers

  lazy val test =
    Seq(
      catsLaws,
      catsEffectLaws,
      catsTestkitScalatest,
      disciplineScalatest,
      disciplineCore,
      scalacheck,
      scalacheckShapeless,
      scalaTest
    )
}
