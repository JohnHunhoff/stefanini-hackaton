package dao;

import dao.Aluno;
import dao.Disciplina;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-09T15:22:25")
@StaticMetamodel(Turma.class)
public class Turma_ { 

    public static volatile ListAttribute<Turma, Disciplina> disciplinas;
    public static volatile ListAttribute<Turma, Aluno> alunos;
    public static volatile SingularAttribute<Turma, Long> id;

}