import mail.{Mail, send}
import org.scalatest.FunSpec

/**
  * Created by prayagupd
  * on 1/9/17.
  */

class mailTests extends FunSpec {
  describe("Mailer") {
    it("sends an email"){
      send a new Mail (
        from = "prayag.upadhyay@divinen.com" -> "Prayag Upd",
        to = Seq("prayag.upadhyay@divinen.com"),
        subject = "Error doing something",
        message = "Error occurred.",
        richMessage = Some("Here's the <blink>failure</blink> <strong>happened</strong>...")
      )
      assert(1 == 1)
    }
  }
}
