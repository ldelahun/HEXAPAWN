"""
This program will play HEXAPAWN in the console
Mainly used to test out features of the game
before working on the GUI version
"""
import sys
import Play_game


def main():
    # Handling the arguments for the program
    args = sys.argv[1:]

    if not args:  # sets the default number to 3 for simplicity sakes
        board_size = 3
        print('Remember!!!! \nYou can select custom board size by adding a number \n'
              'example: Console_play.py 4')
    else:
        board_size = int(args[0])

    # Generates game instance
    board, pieces = Play_game.start_game(board_size)  # Creates a board and piece objects

    print(pieces)


if __name__ == '__main__':
    main()
