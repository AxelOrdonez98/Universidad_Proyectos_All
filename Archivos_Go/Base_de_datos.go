package main

import (
	"database/sql"
	"fmt"
)
import _ "github.com/go-sql-driver/mysql"

type Persona struct {
	Id int
	Nombre string
	Correo string
	Contraseña string
}

func main() {
	insert(Persona{1, "Axel", "axelordonez@gmail.com", "4Pesos"})
	results := selectAll()
	fmt.Println("Selecciona todos")
	for results.Next() {
		var Persona Persona
		results.Scan(&Persona.Id, &Persona.Nombre, &Persona.Correo, &Persona.Contraseña)
		fmt.Println(Persona.Id, Persona.Nombre, Persona.Correo, Persona.Contraseña)
	}

	fmt.Println("Selecciona por id")
	result := selectById(4)
	var Persona Persona
	result.Scan(&Persona.Id, &Persona.Nombre, &Persona.Correo, &Persona.Contraseña)
	fmt.Println(Persona.Id, Persona.Nombre, Persona.Correo, Persona.Contraseña)

}

func connect() *sql.DB {
	db, err := sql.Open("mysql", "root:@tcp(localhost)/unedl")
	if err != nil {
		fmt.Println("Error! Getting connection...")
	}
	return db;
}

func insert(Persona Persona) {
	db := connect()
	insert, err := db.Query("INSERT INTO ejemplogo VALUES (?, ?, ?, ?)", Persona.Id, Persona.Nombre, Persona.Correo, Persona.Contraseña)
	if err != nil {
		fmt.Println("Error! Inserting records...")
	}
	defer insert.Close()
	defer db.Close()
}

func selectAll() *sql.Rows {
	db := connect()
	results, err := db.Query("SELECT * FROM ejemplogo")
	if err != nil {
		fmt.Println("Error! Getting records...")
	}
	defer db.Close()
	return results
}

func selectById(id int) *sql.Row {
	db := connect()
	result := db.QueryRow("SELECT * FROM ejemplogo WHERE id=?", id)
	defer db.Close()
	return result
}

func updateById(Persona Persona) {
	db := connect()
	db.QueryRow("UPDATE ejepmlogo SET nombre=?, correo=?, contraseña=? WHERE id=?", Persona.Nombre, Persona.Correo, Persona.Contraseña, Persona.Id)
}

func delete(id int) {
	db := connect()
	db.QueryRow("DELETE FROM ejemplogo WHERE id=?", id)
}