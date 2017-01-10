tellher
--------

- sends an email to her
- uses `commons-email`
- change config, 

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

- copy pasta of https://gist.github.com/mariussoutier/3436111
