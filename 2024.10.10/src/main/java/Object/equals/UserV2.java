package Object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

   /* @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj;  // 메서드는 Object 타입을 매개 변수로 받기에 이것을 (UserV2) 타입으로 캐스팅 해준다
        return this.id.equals(user.id);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }


}
