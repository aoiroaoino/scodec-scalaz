import com.typesafe.tools.mima.core._
import com.typesafe.tools.mima.plugin.MimaKeys._

scodecModule := "scodec-scalaz"

scodecPrimaryModule

scodecPrimaryModuleJvm

contributors ++= Seq(Contributor("mpilquist", "Michael Pilquist"), Contributor("pchiusano", "Paul Chiusano"))

rootPackage := "scodec.interop.scalaz"

crossScalaVersions := crossScalaVersions.value.filterNot { _.startsWith("2.12.") }

libraryDependencies ++= Seq(
  "org.scodec" %% "scodec-core" % "1.9.0",
  "org.scalaz" %% "scalaz-core" % "7.1.0",
  "org.scalaz" %% "scalaz-concurrent" % "7.1.0"
)

OsgiKeys.exportPackage := Seq("scodec.interop.scalaz;version=${Bundle-Version}")

OsgiKeys.importPackage := Seq(
  """scodec.bits.*;version="$<range;[==,=+);$<@>>"""",
  """scodec.*;version="$<range;[==,=+);$<@>>"""",
  """scala.*;version="$<range;[==,=+);$<@>>"""",
  """scalaz.*;version="$<range;[==,=+);$<@>>"""",
  "*"
)

binaryIssueFilters := Seq(
)
