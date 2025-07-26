# 🚖 Taxi Booking System

A **Java Console Application** simulating a **Taxi Booking System** that allows customers to book, track, and manage taxi services efficiently.

---

## 📦 Features

✅ **Customer Booking System**  
Allow users to book a taxi by providing name, pickup, and drop locations.

✅ **Distance & Fare Calculation**  
Automatically calculate the shortest distance between locations and compute the fare.

✅ **Available Taxi Display**  
Show available taxis nearest to the customer location in real time.

✅ **Trip History**  
Maintain individual booking history for each taxi.

✅ **Fair Allocation**  
Assign taxis based on:
- Shortest distance from pickup point
- Least recent ride completion time (FIFO tie-breaker)

✅ **Customizable Locations**  
Supports multiple custom locations and dynamic distance matrix updates.

✅ **Robust Validation**  
Handles invalid inputs and ensures smooth user experience.

---

## 🧮 Distance & Fare Logic


💰 **Fare Calculation Formula**  
Fare = Base Fare + (Distance × Rate per km)

- Base Fare = ₹50  
- Rate per km = ₹10  

---

## 🚀 How to Run

### ⚙️ Prerequisites

- ☕ Java 8 or higher (Java 24 compatible)
- 🐙 Git (if cloning the repo)

### ▶️ Steps to Run

```bash
# 1. Clone the repository
git clone https://github.com/your-username/TaxiBookingSystem.git

# 2. Navigate to the source directory
cd src

# 3. Compile the Java files
javac com/practice/TaxiBookingSystem/*.java

# 4. Run the application
java com.practice.TaxiBookingSystem.MainClass
🏗 Project Structure

src/
└── com/
    └── practice/
        └── TaxiBookingSystem/
            ├── MainClass.java
            ├── Taxi.java
            ├── Booking.java
            ├── DistanceGraph.java
            ├── Customer.java
            ├── TripHistory.java
            ├── TaxiManager.java
            └── LocationManager.java
🖥 Sample Console UI

🚖 Welcome to the Taxi Booking System

1. Book a taxi
2. View available taxis
3. View taxi trip history
4. Show all taxi statuses
5. Exit
📸 Sample Output

Enter Customer Name: Ashok
Enter Pickup Location: A
Enter Drop Location: C

✅ Booking Confirmed!
Taxi ID: T2
Distance: 6 km
Fare: ₹110
✍️ Author
👤 Ashok Kumar
📧 [ashokkumar310303@gmail.com]


📜 License
📝 This project is licensed under the MIT License.
You are free to use, modify, and distribute it for educational or commercial purposes.

💡 Future Enhancements
🌐 GUI version using JavaFX or Swing

📱 Android version of the app

📊 Admin dashboard for analytics

🛰️ Real-time taxi tracking using GPS (simulation)

