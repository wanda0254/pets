package com.example.android.pets;

import android.provider.BaseColumns;

/**
 * API Contract for the Pets app.
 */
public class PetContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private PetContract() {
    }

    /****/
    public static final class PetEntry implements BaseColumns {
        public final static String TABLE_NAME = "pets";
        /****/
        public final static String _ID = BaseColumns._ID;

        /****/
        public final static String COLUMN_PET_NAME = "name";

        /****/
        public final static String COLUMN_PET_BREED = "breed";

        /**
         * Gender of the pet.
         * <p>
         * The only possible values are {@link //#GENDER_UNKNOWN}, {@link //#GENDER_MALE},
         * or {@link //#GENDER_FEMALE}.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_PET_GENDER = "gender";

        /**
         * Weight of the pet.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the gender of the pet.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }

}

