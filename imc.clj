(ns compras.imc)


(defn imc
  [peso altura]
  
  (if (< (/ peso (* altura altura)) 18.5)
    :baixo-peso
    (if (and (< (/ peso (* altura altura)) 24.9) (>= (/ peso (* altura altura)) 18.5))
      :peso-ideal
      :acima-peso)))


(imc 1 2)

