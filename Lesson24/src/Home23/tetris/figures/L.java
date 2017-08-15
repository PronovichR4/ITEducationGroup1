package Home23.tetris.figures;

import Home23.tetris.Field;
import Home23.tetris.Figure;

public class L extends Figure {
	public L() {
		// задание точек, в которых "присутствуют" элементы фигуры
		if (Math.random() > 0.5) {
			// левосторонная
			size[0][2] = size[1][0] = size[1][1] = size[1][2] = true;
		} else {
			// правосторонная
			size[0][0] = size[1][0] = size[1][1] = size[1][2] = true;
		}
	}

	@Override
	public void rotate(Field field) {
		// невозможен поворот из крайнего правого положения или крайнего левого
		// положения
		if (coordOnfield[1][1] == coordOnfield[2][1]
				&& (coordOnfield[1][1] == field.field[0].length - 1 || coordOnfield[1][1] == 0)) {
			return;
		}
		// невозможен поворот, если рядом препятствие
		if (coordOnfield[1][1] == coordOnfield[2][1] && (field.field[coordOnfield[1][0]][coordOnfield[1][1] + 1]
				|| field.field[coordOnfield[1][0]][coordOnfield[1][1] - 1]
				|| field.field[coordOnfield[2][0]][coordOnfield[2][1] + 1]
				|| field.field[coordOnfield[2][0]][coordOnfield[2][1] - 1]
				|| field.field[coordOnfield[3][0]][coordOnfield[3][1] + 1]
				|| field.field[coordOnfield[3][0]][coordOnfield[3][1] - 1])) {
			return;
		}

		// выбор метода поворота в зависимости от текущего положения фигуры
		if (coordOnfield[0][0] < coordOnfield[1][0] && coordOnfield[1][0] == coordOnfield[2][0]) {
			rotatePositionOne();
		} else if (coordOnfield[0][1] > coordOnfield[1][1]) {
			rotatePositionTwo();
		} else if (coordOnfield[0][0] > coordOnfield[1][0]) {
			rotatePositionThree();
		} else if (coordOnfield[0][1] < coordOnfield[1][1]) {
			rotatePositionFour();
		}
	}

	private void rotatePositionOne() {
		// выбор в зависимости от того правостороння или левосторонняя
		if (coordOnfield[0][1] == coordOnfield[1][1]) {
			coordOnfield[0][1] += 2;
		} else {
			coordOnfield[0][0] += 2;
		}

		coordOnfield[1][0] -= 1;
		coordOnfield[1][1] += 1;

		coordOnfield[3][0] += 1;
		coordOnfield[3][1] -= 1;
	}

	private void rotatePositionTwo() {
		if (coordOnfield[0][0] == coordOnfield[1][0]) {
			coordOnfield[0][0] += 2;
		} else {
			coordOnfield[0][1] -= 2;
		}

		coordOnfield[1][0] += 1;
		coordOnfield[1][1] += 1;

		coordOnfield[3][0] -= 1;
		coordOnfield[3][1] -= 1;
	}

	private void rotatePositionThree() {
		if (coordOnfield[0][1] == coordOnfield[1][1]) {
			coordOnfield[0][1] -= 2;
		} else {
			coordOnfield[0][0] -= 2;
		}

		coordOnfield[1][0] += 1;
		coordOnfield[1][1] -= 1;

		coordOnfield[3][0] -= 1;
		coordOnfield[3][1] += 1;
	}

	private void rotatePositionFour() {
		if (coordOnfield[0][0] != coordOnfield[3][0]) {
			coordOnfield[0][0] -= 2;
		} else {
			coordOnfield[0][1] += 2;
		}

		coordOnfield[1][0] -= 1;
		coordOnfield[1][1] -= 1;

		coordOnfield[3][0] += 1;
		coordOnfield[3][1] += 1;
	}
}