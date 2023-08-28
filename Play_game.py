"""
This files runs all the game utility stuff
things like rules with moving or winning
Basically ties the frontend of the program to
the backend of it
"""
from Chess import Board
from Chess import Piece

# Constant naming scheme for both teams
TEAM_WHITE = 'W'
TEAM_BLACK = 'B'


def make_pawn_teams(amount):
    """
    Creates a team and stores it to a list
    :param amount: How many pawns
    :return: Returns a dict with two teams with pawns
    """
    out_dict = {
        TEAM_WHITE: [],
        TEAM_BLACK: []
    }

    for i in range(amount):
        out_dict[TEAM_WHITE].append(Piece(TEAM_WHITE))
        out_dict[TEAM_BLACK].append(Piece(TEAM_BLACK))

    return out_dict


def start_game(board_size):
    """
    Will lay down many objects used to run the game like the board and pieces
    :param board_size: how big is the board
    :return: board object, pawns list
    """
    board = Board(board_size)  # Creates our board object
    pawns = make_pawn_teams(board_size)

    return board, pawns
