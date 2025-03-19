class car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
        print("my car details are : " + self.manufacturer + " " + self.model + " " + self.make + " " + self.transmission + " " + self.color)

    def accelerate(self):
        print(self.manufacturer + " " + self.model +  " is moving")

    def stop(self):
        print(self.manufacturer + " " + self.model +  " has stopped")

c1 = car("Toyota", "Corolla", "2015", "Manual", "White")
c2 = car("Maruti", "800", "2013", "Manual", "Red")
c3 = car("Suzuki", "Swift", "2017", "Automatic", "Black")

c1.accelerate()
c1.stop()

c2.accelerate()
c2.stop()

c3.accelerate()
c3.stop()

del c1, c2, c3