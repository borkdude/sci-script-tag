(ns scittle.promesa
  (:require
   [sci.configs.funcool.promesa :as p]
   [scittle.core :as scittle]))

(scittle/register-plugin!
  ::promesa
  p/config)
