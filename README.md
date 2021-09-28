Run

```sh
FOO=shell clojure -m figwheel.main -bo dev
```
There is a `.lein-env` file which also sets the variable `FOO`.

This is to trigger [this warning](https://github.com/weavejester/environ/blob/aa90997b38bb8070d94dc4a00a14e656eb5fc9ae/environ/src/environ/core.cljc#L75)

Check `less target/public/cljs-out/dev/chromex/defaults.js`

The warning from `environ` will have been emitted to the JS file:

```
// Compiled by ClojureScript 1.10.773 {}
Warning: environ value test for key :foo has been overwritten with original
```
