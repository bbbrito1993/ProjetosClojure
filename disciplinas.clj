(ns compras.disciplinas
  (:require [clojure.string :refer [join upper-case]]))

; Criar uma função que, dada um conjunto(vetor)
; de discilpinas e o semestre do(a) discente deve:
; - filtrar a lista para exibir discilplinas restantes (que sejam semestre atual ou superior)
; - transformar nome da discilplina para maiúsculo e descartar demais informações
; - criar string concatenando o nome de todas as disciplinas filtradas.




(defn disciplinas
  []
  [{:nome "Estrutura de Dados" :semestre 2}
   {:nome "Inteligencia Articficial" :semestre 3}
   {:nome "Algoritmos" :semestre 1}])

(disciplinas)

(defn filtrando-disciplinas
  [disciplinas semestre-atual]
  (join ", " (map upper-case (map :nome (filter #(>= (:semestre %) semestre-atual) disciplinas)))))

(filtrando-disciplinas (disciplinas) 2)

; Threading Last

(defn filtrando-disciplinas
  [disciplinas semestre-atual]
  (->> disciplinas
       (filter #(>= (:semestre %) semestre-atual))
       (map :nome)
       (map upper-case)
       (join ", ")))

(filtrando-disciplinas (disciplinas) 2)


(defn dados-pessoais
  [pessoa]
  (-> pessoa
      (assoc :hair-color :gray)
      (update :age inc)))

(dados-pessoais {:nome "Benedito" :age 28})


