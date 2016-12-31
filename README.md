# speclj-bug
`lein spec` and lein `spec -a` do not agree on the namespace in which tests run.
`lein spec -a` runs tests in the namespace perscribed in the spec file, while `lein spec` runs them from the user namespace (like a REPL).

To reproduce this problem do this:
```bash
> git clone https://github.com/brosenan/speclj-bug.git
> cd speclj-bug
> lein spec
# this will fail...
> lein spec -a
# this will succeed
```
My configuration:
* Leiningen 2.7.1 on Java 1.8.0_111 OpenJDK 64-Bit Server VM
* [speclj "3.3.1"]
