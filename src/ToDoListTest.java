public class ToDoListTest {

    public static void main(String[] args) {


        //Start Application Window and GUI
            //run application
                //Start the GUI
                    //Three Buttons at the top labelled "Pending", "Completed", "Overdue"
                    //Middle of screen shows currently scheduled items of the selected button. Pending is shown by default
                    //Each item is something that can be selected via checkbox
                    //Navigation Bar appears at the bottom of the screen
                        //Mark as Done Button is the first item
                        //Add button is the second item in the navigation bar
                        //If a checkbox is selected then an Edit Button will appear in the Navigation Bar


        //Pending Category
            //Create text file for storing items
            //When Pending Category is selected show current items in the list

        //Completed Category
            //Create text file for storing items

        //Overdue Category
            //Create text file for storing items

        //If To-Do List is Empty Message

        //Navigation Bar

            //Add Button
                //Title
                //Description
                //Deadline
                //Confirm Button
                //Cancel Button
                //File Storage to Text File
                //Error Handling
                    //Deadline should be later than current time

            //Edit Button
                //Title (Pre-filled in data)
                //Description (Pre-filled in data)
                //Deadline
                //Confirm Button
                //Cancel Button
                //File Storage to Text File
                //Error Handling
                    //Deadline should be later than current time

        //Notification Box
            //New Window is created when 10 minutes until the time of a deadline
            //Window states the deadline is in 10 minutes for the task

        //Item List Transfers
            //If an item in pending is passed the deadline and not marked as complete, then it is moved to Overdue
            //If an item in pending or overdue is marked as complete, then it is moved to Completed


    }


}
