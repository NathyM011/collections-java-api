package set.OrdenacaoSet;

import java.util.Comparator;

class ComparatorNota implements Comparator<Alunos> {
    @Override
    public int compare(Alunos o1, Alunos o2) {
      return Double.compare(o1.getMedia(), o2.getMedia());
    }
  }