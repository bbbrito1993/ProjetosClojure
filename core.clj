(ns compras.core
  (:gen-class))

(defn compras
  []
  {:tomate {:quantidade 2 , :preco 3}
   :arroz {:quantidade 3 , :preco 8}
   :batata {:quantidade 4 , :preco 4}})

(get (compras) :tomate :preco)
((compras) :tomate)
(:tomate(compras))

(:preco (:tomate (compras)))

(update-in (compras) [:tomate :preco] dec)
