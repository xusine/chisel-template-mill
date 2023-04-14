import mill._, scalalib._
// If you are using VSCode to write Scala, please uncomment the following line to enable Bloop plugin:
// import $ivy.`com.lihaoyi::mill-contrib-bloop:`

/**
 * All chisel modules should extends this trait where the chisel dependency is included.
 */ 
trait ChiselModule extends ScalaModule {
  def scalaVersion = "2.13.10"

  override def ivyDeps = Agg(
    ivy"edu.berkeley.cs::chisel3:3.6.0"
  )

  override def scalacOptions = Seq(
    "-language:reflectiveCalls",
    "-deprecation",
    "-feature",
    "-Xcheckinit",
  )

  override def scalacPluginIvyDeps = Agg(
    ivy"edu.berkeley.cs:::chisel3-plugin:3.6.0",
  )

  object test extends Tests {
    override def ivyDeps = Agg(
      ivy"edu.berkeley.cs::chiseltest:0.6.0"
    )
    def testFramework = "org.scalatest.tools.Framework"
  }
}


object GCD extends ChiselModule {
  
}
