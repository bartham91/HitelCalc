package com.example.hitelcalc;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;


import java.util.List;

@RegisterBeanMapper(Hitel.class)
public interface HitelDao {
    @SqlUpdate("CREATE TABLE hitelset (szam INTEGER PRIMARY KEY, nev VARCHAR NOT NULL, honapokszama INTEGER NOT NULL)")
    void createTable();

    @SqlUpdate("INSERT INTO hitelset VALUES (:szam, :nev, :honapokszama)")
    void insertHitel(@Bind("szam") int szam, @Bind("nev") String nev, @Bind("honapokszama") int honapokszama);

    @SqlUpdate("INSERT INTO hitelset VALUES (:szam, :nev, :honapokszama)")
    void insertHitel(@BindBean Hitel hitel);

    @SqlQuery("SELECT * from hitelset")
    List<Hitel> listHitels();


}
