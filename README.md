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
```

- copy pasta of https://gist.github.com/mariussoutier/3436111
