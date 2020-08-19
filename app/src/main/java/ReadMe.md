Hello

dans le projet, je nai pas réussi le dark mode, la récupération des spinner (liste déroulante), le lien mot de passe oublié
 et l'authentification google et facebook (j'ai enlever les images)

pour la connexion google et facebook : page inscription et connexion

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="151dp"
        android:layout_marginTop="50px"
        android:layout_marginBottom="50px"
        android:orientation="horizontal">

        <ImageButton
            android:layout_width="0dp"
            android:layout_height="70dp"
            android:layout_weight="1"
            android:background="@color/white"
            android:src="@drawable/fb"
            android:layout_marginLeft="80dp"/>

        <ImageButton
            android:layout_width="0dp"
            android:layout_height="70dp"
            android:layout_weight="1"
            android:background="@color/white"
            android:src="@drawable/google"
            android:layout_marginRight="80dp"

            />

    </LinearLayout>


    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_marginBottom="50px"
        android:fontFamily="@font/lato"
        android:text=" ou " />
        
pour la liste des joueurs (résultat) :

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:background="@drawable/games_list"
            android:layout_marginTop="25dp"
            >

            <ImageView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"/>

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_weight="3">

                <TextView
                    android:id="@+id/reesult_pseudo"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="%d"/>

                <TextView
                    android:id="@+id/result_level"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="%d"/>
                    
            </LinearLayout>

            <ImageView
                    android:layout_width="40dp"
                    android:layout_height="match_parent"
                    android:src="@drawable/ic_game_controller_outline_footer"/>

        </LinearLayout>
        
        <Space
                android:layout_width="match_parent"
                android:layout_height="50dp" />

