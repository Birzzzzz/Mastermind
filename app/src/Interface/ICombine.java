package Interface;

import Model.Line;
import Model.Piece;

public interface ICombine {
    public Line generateSecretCombine();
    public Line generateUserCombine();
    public Line inputCombine();
    public boolean checkSecretUserCombine();
}
