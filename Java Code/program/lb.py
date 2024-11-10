import tkinter as tk
from tkinter import messagebox

# Function to display the alert message
def show_alert():
    messagebox.showinfo("Alert", "Button Pressed!")

# Create the main window
root = tk.Tk()
root.title("Alert Message Example")

# Create a button and attach the show_alert function
button = tk.Button(root, text="Press Me", command=show_alert)
button.pack(pady=20)

# Run the application
root.mainloop()
