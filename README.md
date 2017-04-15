tellher via SMTP
--------

- sends an email to her
- uses `commons-email`
- change config, 

what is SMTP
-------------

```
Although electronic mail servers and other mail transfer agents use SMTP to send and receive mail messages, 
user-level client mail applications typically use SMTP only for sending messages to a mail server for relaying. 

For retrieving messages, client applications usually use either IMAP or POP3.
```

http://ubuntuwiki.net/index.php/SMTP,_testing_via_Telnet

https://en.wikipedia.org/wiki/Simple_Mail_Transfer_Protocol

![](https://upload.wikimedia.org/wikipedia/commons/6/69/SMTP-transfer-model.svg)

TODO

```
mail.host=exchange.divinen.net
mail.username=whatever
mail.password=whatever
```

- usage

```scala
  send a new Mail (
        from = "prayagupd@divinen.com" -> "Prayag Upd",
        to = Seq("prayagupd@divinen.com"),
        subject = "Roses and love",
        message = "Pipeline restarted.",
        richMessage = Some("Here's the <blink>roses</blink> <strong>!!!</strong>...")
      )
```

installation
--------------

```
wget https://dl.bintray.com/sbt/native-packages/sbt/0.13.15/sbt-0.13.15.tgz
sbt test
info] Loading project definition from /home/ubuntu/workspace/tellher/project
[info] Set current project to tellher (in build file:/home/ubuntu/workspace/tellher/)
mail.host=exchange.changeme.net
mail.smtp.port=25
#mail.username=prayagupd
#mail.password=jfkj
DEBUG: JavaMail version 1.5.2
DEBUG: successfully loaded resource: /META-INF/javamail.default.providers
DEBUG: Tables of loaded providers
DEBUG: Providers Listed By Class Name: {com.sun.mail.smtp.SMTPSSLTransport=javax.mail.Provider[TRANSPORT,smtps,com.sun.mail.smtp.SMTPSSLTransport,Oracle], com.sun.mail.smtp.SMTPTransport=javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle], com.sun.mail.imap.IMAPSSLStore=javax.mail.Provider[STORE,imaps,com.sun.mail.imap.IMAPSSLStore,Oracle], com.sun.mail.pop3.POP3SSLStore=javax.mail.Provider[STORE,pop3s,com.sun.mail.pop3.POP3SSLStore,Oracle], com.sun.mail.imap.IMAPStore=javax.mail.Provider[STORE,imap,com.sun.mail.imap.IMAPStore,Oracle], com.sun.mail.pop3.POP3Store=javax.mail.Provider[STORE,pop3,com.sun.mail.pop3.POP3Store,Oracle]}
DEBUG: Providers Listed By Protocol: {imaps=javax.mail.Provider[STORE,imaps,com.sun.mail.imap.IMAPSSLStore,Oracle], imap=javax.mail.Provider[STORE,imap,com.sun.mail.imap.IMAPStore,Oracle], smtps=javax.mail.Provider[TRANSPORT,smtps,com.sun.mail.smtp.SMTPSSLTransport,Oracle], pop3=javax.mail.Provider[STORE,pop3,com.sun.mail.pop3.POP3Store,Oracle], pop3s=javax.mail.Provider[STORE,pop3s,com.sun.mail.pop3.POP3SSLStore,Oracle], smtp=javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle]}
DEBUG: successfully loaded resource: /META-INF/javamail.default.address.map
DEBUG: getProvider() returning javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle]
DEBUG SMTP: useEhlo true, useAuth false
DEBUG SMTP: trying to connect to host "exchange.changeme.net", port 25, isSSL false
220 M0319P45.changeme.net Microsoft ESMTP MAIL Service ready at Sat, 15 Apr 2017 15:44:13 -0700
DEBUG SMTP: connected to host "exchange.changeme.net", port: 25

EHLO ip-172-21-3-9.us-west-2.compute.internal
250-M0319P45.changeme.net Hello [172.21.3.9]
250-SIZE 20971520
250-PIPELINING
250-DSN
250-ENHANCEDSTATUSCODES
250-AUTH
250-8BITMIME
250-BINARYMIME
250-CHUNKING
250-XEXCH50
250 XSHADOW
DEBUG SMTP: Found extension "SIZE", arg "20971520"
DEBUG SMTP: Found extension "PIPELINING", arg ""
DEBUG SMTP: Found extension "DSN", arg ""
DEBUG SMTP: Found extension "ENHANCEDSTATUSCODES", arg ""
DEBUG SMTP: Found extension "AUTH", arg ""
DEBUG SMTP: Found extension "8BITMIME", arg ""
DEBUG SMTP: Found extension "BINARYMIME", arg ""
DEBUG SMTP: Found extension "CHUNKING", arg ""
DEBUG SMTP: Found extension "XEXCH50", arg ""
DEBUG SMTP: Found extension "XSHADOW", arg ""
DEBUG SMTP: use8bit false
MAIL FROM:<prayag.upd@changeme.com>
250 2.1.0 Sender OK
RCPT TO:<prayag.upd@changeme.com>
250 2.1.5 Recipient OK
DEBUG SMTP: Verified Addresses
DEBUG SMTP:   prayag.upd@changeme.com
DATA
354 Start mail input; end with <CRLF>.<CRLF>
Date: Sat, 15 Apr 2017 22:44:13 +0000 (UTC)
From: Prayag Upd <prayag.upd@changeme.com>
To: prayag.upd@changeme.com
Message-ID: <1907542359.1.1492296253397.JavaMail.ubuntu@ip-172-21-3-9>
Subject: Error doing something
MIME-Version: 1.0
Content-Type: multipart/alternative; 
	boundary="----=_Part_0_1218580093.1492296253351"

------=_Part_0_1218580093.1492296253351
Content-Type: text/plain; charset=us-ascii
Content-Transfer-Encoding: 7bit

Error occurred.
------=_Part_0_1218580093.1492296253351
Content-Type: text/html; charset=us-ascii
Content-Transfer-Encoding: 7bit

Here's the <blink>failure</blink> <strong>happened</strong>...
------=_Part_0_1218580093.1492296253351--
.
250 2.6.0 <1907542359.1.1492296253397.JavaMail.ubuntu@ip-172-21-3-9> [InternalId=310935766] Queued mail for delivery
QUIT
221 2.0.0 Service closing transmission channel
[info] mailTests:
[info] Mailer
[info] - sends an email
[info] Run completed in 997 milliseconds.
[info] Total number of tests run: 1
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 2 s, completed Apr 15, 2017 10:44:14 PM

```

using telnet
----

```bash
telnet -a exchange.changeme.net 25
Trying 10.16.92.37...
Connected to exchange.changeme.net.
Escape character is '^]'.
220 M0319P49.changeme.net Microsoft ESMTP MAIL Service ready at Sat, 15 Apr 2017 15:55:58 -0700
EHLO prayag
250-M0319P49.changeme.net Hello [172.21.3.9]
250-SIZE 20971520
250-PIPELINING
250-DSN
250-ENHANCEDSTATUSCODES
250-AUTH
250-8BITMIME
250-BINARYMIME
250-CHUNKING
250-XEXCH50
250 XSHADOW
MAILL FROM: prayag.upd@changeme.com
500 5.3.3 Unrecognized command
MAIL FROM: <prayag.upd@changeme.com>
250 2.1.0 Sender OK
RCPT TO: <prayag.upd@changeme.com>
250 2.1.5 Recipient OK
DATA
354 Start mail input; end with <CRLF>.<CRLF>
This is a test alert from telnet session.
.
250 2.6.0 <c655e2c4-036e-480a-a7fa-38456ec8b96d@M0319P49.changeme.net> [InternalId=270320338] Queued mail for delivery
QUIT
221 2.0.0 Service closing transmission channel
Connection closed by foreign host.
```

- copy pasta of https://gist.github.com/mariussoutier/3436111
