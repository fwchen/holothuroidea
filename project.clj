(defproject holothuroidea "0.1.2"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[com.cemerick/piggieback "0.2.1"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.671"]
                 [cider/cider-nrepl "0.15.0"]
                 [org.clojure/core.async "0.3.426"]
                 [funcool/promesa "1.8.0"]
                 [fipp "0.6.8"]
                 [markdown-clj "0.9.99"]
                 [io.aviso/pretty "0.1.34"]
                 [lein-doo "0.1.7"]]
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :jvm-opts ^:replace ["-Xmx1g"]
  :plugins [[lein-npm "0.7.0-rc1"]
            [io.aviso/pretty "0.1.34"]]
  :npm {:dependencies [[source-map-support "0.4.0"]
                       [colors "1.1.2"]
                       [ora "v1.3.0"]]
        :version "0.0.2"
        :name "holothuroidea",
        :main "out/holothuroidea"
        :repository {:type "git"
                     :url "git@github.com:fwchen/holothuroidea.git"}
        :bin {:holothuroidea "holothuroidea"}
        :private false
        :license "MIT"}
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target")
