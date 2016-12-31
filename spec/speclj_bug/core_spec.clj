(ns speclj-bug.core-spec
  (:require [speclj.core :refer :all]
            [speclj-bug.core :refer :all]))

(describe "a test"
          (it "should be the spec namespace"
              (should= "speclj-bug.core-spec" (str *ns*))))
