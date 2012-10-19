------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

DESCRIPTION:
The robot must find a product and deliver it to the end. There will be a maze. The robot will move each turn through maze going around obstacles and picking up the product and then finally dropping the product off at the destination.

ROBOT:
-Robot moves in forward and reverse directions.*
-Robot turns to the right or left.*
-Robot extends its arm.
-Robot grabs an object.
-Robot retracts its arm.
-Robot drops an object off.
-Holds map position.*
-Holds facing direction.*
-Holds position of arm.
-Holds 1 object in arm.
-Takes an action each turn. A list of acceptable actions are passed back to the robot.*
-Draws itself


MAP:
-Detects collisions with walls and other objects.
-Draws itself.
-Can check if the robot is facing and next to an object.*
-Contains a 2D array.*
-Each cell is defined by a x and a y coordinate.*
-Determines the acceptable moves the robot can make.*

GUI:
-Delegates drawing responsibilities to Map and Robot.
-Has buttons to start the simulation.

SIMULATION: // The game logic.
-Accepts a robot.*
-Updates the UI.*
-Takes turns.*

COORDINATE:* // Structure
-Contains an x and y value.
-Used to store information.

DIRECTION:* // Enum
-An enum with 4 directions.
-Used to store information.

MOVES:* // Enum
-Contains a list of moves the robot can make.
-Used to send messages.





DETAILS
