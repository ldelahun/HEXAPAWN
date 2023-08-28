"""
This program will play HEXAPAWN in the console
Mainly used to test out features of the game
before working on the GUI version
"""
import sys


def main():
    # Handling the arguments for the program
    args = sys.argv[1:]

    if not args:  # sets the default number to 3 for simplicity sakes
        board_size = 3
        print('Remember!!!! \nYou can select custom board size by adding a number \n'
              'example: Console_play.py 4')
    else:
        board_size = int(args[0])


    


if __name__ == '__main__':
    main()
