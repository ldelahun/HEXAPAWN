class Board:
    def __init__(self, board_size=8, white_team=None, black_team=None):
        self.virtual_board = [['' for x in range(board_size)] for x in range(board_size)]

