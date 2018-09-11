package ru.job4j.tictactoe;

import java.util.function.Predicate;

/**
 * class Logic3T for logic TicTacToe.
 *@author Nikolay Tlachenko (mailto: Tkach1702@mail.ru)
 *@version $Id$
 *@since 0.1
 */
public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }
    /**
     * isWinnerX - victory X
     * @return resalt (true or false)
     */
    public boolean isWinnerX() {
        boolean winX = false;

        if (this.fillBy(Figure3T::hasMarkX, 0, 0, 1, 1)
        || this.fillBy(Figure3T::hasMarkX, this.table.length - 1, 0, -1, 1)) {
            winX = true;
        }
        if (!winX) {
            for (int i = 0; i <= this.table.length - 1; i++) {
                if (this.fillBy(Figure3T::hasMarkX, i, 0, 0, 1)
                        || this.fillBy(Figure3T::hasMarkX, this.table.length - 1, i, -1, 0)) {
                    winX = true;
                    break;
                }
            }
        }
        return winX;
    }
    /**
     * isWinnerO - victory O
     * @return resalt (true or false)
     */
    public boolean isWinnerO() {
        boolean winO = false;

        if (this.fillBy(Figure3T::hasMarkO, 0, 0, 1, 1)
                || this.fillBy(Figure3T::hasMarkO, this.table.length - 1, 0, -1, 1)) {
            winO = true;
        }
        if (!winO) {
            for (int i = 0; i <= this.table.length - 1; i++) {
                if (this.fillBy(Figure3T::hasMarkO, i, 0, 0, 1)
                        || this.fillBy(Figure3T::hasMarkO, this.table.length - 1, i, -1, 0)) {
                    winO = true;
                    break;
                }
            }
        }
        return winO;
    }
    /**
     * hasGap - full table
     * @return resalt (true or false)
     */
    public boolean hasGap() {
        boolean vacant = false;
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table.length; column++) {
                Figure3T cell = this.table[row][column];
                if (!cell.hasMarkO() & !cell.hasMarkX()) {
                    vacant = true;
                    break;
                }
            }
            if (vacant) {
                break;
            }
        }
        return vacant;
    }

    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }
}

