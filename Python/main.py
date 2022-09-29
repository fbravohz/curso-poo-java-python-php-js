from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("123WEWR1", Account("Antonio Mujica","INE"))
    print(vars(car))
    print(vars(car.driver))
    print("Los objetos anteriores están en formato JSON")