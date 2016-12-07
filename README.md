in epsilon run:
`boot watch pom -p tim/epsilon -v 1.1 jar install`

in omicron, run:
`boot -c tim/epsilon:1.1 repl`

Try try changing functions in `epsilon.core`

ie, reload this variable
```
(def sqlmap {:select [:a :b :c]
             :from [:cran]
             :where [:= :f.a "baz"]})
```

then call this function from `omicron.core` in the `omicron` project

ie  `omicron.core=> (esp/bar)`
