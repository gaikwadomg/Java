import tkinter as tk
from tkinter import messagebox

# Function to display the alert message
def show_alert():
    messagebox.showinfo("Alert", "Button has been pressed!")

# Create main window
root = tk.Tk()
root.title("Alert Message Program")

# Create a button
button = tk.Button(root, text="Press Me", command=show_alert)
button.pack(pady=20)

# Run the application
root.mainloop()
