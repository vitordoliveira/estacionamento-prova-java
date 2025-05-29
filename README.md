# Parking System (Sistema de Estacionamento)

## 🎓 Academic Project

This project was developed as the answer to the Second Evaluative Activity (Atividade Avaliativa 2) for the **Computer Programming I** course at **IFSP Caraguatatuba**. It aims to consolidate core concepts of **Object-Oriented Programming (OOP)** through a parking lot management system.

The project received a grade of **9.4/10** and was evaluated by Professor **Juliana Gregio Matheus Pereira**.

The entire implementation is written in **Brazilian Portuguese**, including class and method names, and follows the academic standards for introductory programming using only **Java SE standard libraries**.

---

## 🧠 OOP Concepts Practiced

- **Encapsulation**: Use of private attributes with public getters/setters.
- **Inheritance**: A base class `Veiculo` extended by `Carro`, `Moto`, and `Caminhao`.
- **Polymorphism**: Method overriding for specific vehicle behavior.
- **Composition**: The `Estacionamento` class manages and interacts with `Veiculo` objects.
- **Abstraction**: Simplification of vehicle behavior through shared interfaces.

---

## 📚 Project Overview

The system simulates the operation of a parking lot with the following features:

- **Per-minute pricing** by vehicle type:
  - Car: R$ 0.10/min
  - Motorcycle: R$ 0.05/min
  - Truck: R$ 0.20/min
- **Accurate time tracking** using `System.currentTimeMillis()`.
- **Progressive discounts**:
  - 10% off after 6 hours
  - 20% off after 12 hours
- **Duplicate plate blocking**: Vehicles cannot enter again without exiting.
- **Daily revenue report**: Grouped by date and aggregated by total earnings.
- **Automatic receipt generation** at vehicle exit.

> ⚠️ All messages, outputs, and method names are in **Portuguese (pt-BR)**, as per the project requirements.

---

## 📁 Project Structure

/src
└── Prova/
    ├── Veiculo.java
    ├── Carro.java
    ├── Moto.java
    ├── Caminhao.java
    ├── Estacionamento.java
    └── Prova.java

- `Veiculo`: Base class with license plate, model, type, timestamps, and billing methods.
- `Carro`, `Moto`, `Caminhao`: Subclasses with specific attributes (e.g., number of doors, engine capacity).
- `Estacionamento`: Manages vehicle entry/exit, calculates charges, prevents duplicates, and logs daily revenue.
- `Prova`: Demonstration class with simulation of usage and reports.

---

## 🚀 How to Run

1. Open the project in NetBeans IDE.
2. Navigate to the main class (Prova.java).
3. Press Shift+F6 to run the project.

## ✅ Sample Functionalities in Action

- Add vehicles of different types to the parking lot.
- Simulate time passage by manipulating the entrada timestamp.
- Automatically calculate the exact time stayed and total amount due.
- Apply applicable discounts based on total time.
- Print out a structured report of all parked and exited vehicles.
- Display a revenue summary grouped by day.

## 👨‍💻 Author

Developed by Vitor de Oliveira Rodrigues as part of the coursework for Programação de Computadores I at IFSP Caraguatatuba.
