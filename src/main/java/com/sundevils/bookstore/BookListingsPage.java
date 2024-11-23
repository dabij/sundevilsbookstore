package com.sundevils.bookstore;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class BookListingsPage extends Page {
    public BookListingsPage() {
        title = "Book Listings";
        
        // TODO: clear copy & pasted code and actually make the page

        //The following chunk of commented code is the work in progress for the UI of the Book Listings Page.
        //After midnight, I ran into a huge wall, trying to make the scrolling menu of books work as a VBox of Hboxes.
        //This waste of time resulted in me kind of giving up. I have (sort of) set it up to be a grid.
        // The entire window I have (sort of) set up to be a VBox, where it is made of a HBox of the search bar and cart button at the top,
        // the condition and category specifiers in an HBox under that,
        // and the scrolling grid of books under that.
        /*private VBox rowContainer;
	private List<Row> rows = new ArrayList<>();
	private HBox listedBooksContainer;
	private List<ListedBook> listedBooks = new ArrayList<>();
	private HBox specifierPane;

    @Override
    public BookListingsPage() {
        //Creating the grid layout for the Book Listings Page
        VBox base = new VBox(5);
        base.setPadding(new Insets(20));
        base.setStyle("-fx-background-color: #111111;");

        //Creating the layout for the rows containing the listed books
        listedBooksContainer = new HBox(10);
        listedBooksContainer.setPadding(new Insets(5)));
        listedBooksContainer.setStyle("-fx-background-color: #111111;");
        
        //Creating the layout for the VBox to hold the rows
        rowContainer = new VBox(5);
        rowContainer.setPadding(new Insets(5));
        rowContainer.setStyle("-fx-background-color: #111111;");
        
        //
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        grid.setHgap(10);
        grid.setPadding(new Insets(20, 10, 20, 10));
        grid.setStyle("-fx-background-color: #111111;");
        
        //
        for (int i = 0; i < 15; i++) {
            ListedBook listedBook = new ListedBook("Book Title " + (i + 1), "Author " + (i + 1), 5.0);
            listedBooks.add(listedBook);
            listedBooksContainer.getChildren().add(listedBook.createBookItem());
        }
        
        //
        for (int i = 0; i < 15; i++) {
        	for (int j = 0; j < 7; j++) {
        		grid.add(listedBooks.get(i),j,i)
        	}
        }
        
        //Creating the Scrolling pane for the listed books
        ScrollPane scrollPane = new ScrollPane(listedBooksContainer);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background: #111111; -fx-border-color: #111111;");
        root.setCenter(scrollPane);
        
        //Creating the layout pane to contain the two dropdown menus
        specifierPane = new HBox(5);
        specifierPane.setPandding(new Insets5());
        specifierPane.setStyle("-fx-background-color: #111111;");
        
        //Category dropdown
        ObservableList<String> bookCategories = FXCollections.observableArrayList(
                Arrays.asList("Natural Science", "Math", "Fiction"));
		
		Label category = new Label("Category");
		ComboBox<String> categoryComboBox = new ComboBox<>(bookCategories);
		category.setFont(Font.font("", FontWeight.BOLD, 16));
        category.setTextFill(Color.GOLD);
        
        //Condition dropdown
        ObservableList<String> bookCategories = FXCollections.observableArrayList(
                Arrays.asList("Barely Used", "Moderately Used", "Heavily Used"));
		
		Label category = new Label("Condition");
		ComboBox<String> conditionComboBox = new ComboBox<>(bookConditions);
		category.setFont(Font.font("", FontWeight.BOLD, 16));
        category.setTextFill(Color.GOLD);
        
        //Text field for the search bar
        TextField searchField = new TextField();
        
        //Cart Button
        Button testBtn = new Button("Cart");
        testBtn.setStyle("-fx-background-color: darkred; -fx-text-fill: yellow;");
        testBtn.setPrefSize(300, 60);
        testBtn.setFont(Font.font("", FontWeight.BOLD, 20));
        testBtn.setCursor(Cursor.HAND);
        //
        
        
    }*/

        // Creating the grid layout for the login page
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setHgap(20);
        grid.setPadding(new Insets(60, 80, 60, 80));
        grid.setStyle("-fx-background-color: #111111;");

        // Welcome Text
        Text welcomeText = new Text("Placeholder Books Listings Page");
        welcomeText.setFont(Font.font("", FontWeight.BOLD, 48));
        welcomeText.setFill(Color.DARKRED);

        StackPane welcomePane = new StackPane(welcomeText);
        welcomePane.setAlignment(Pos.CENTER);
        grid.add(welcomePane, 0, 0, 2, 1);

        // Navigation Test Button
        Button testBtn = new Button("Cart");
        testBtn.setStyle("-fx-background-color: darkred; -fx-text-fill: yellow;");
        testBtn.setPrefSize(300, 60);
        testBtn.setFont(Font.font("", FontWeight.BOLD, 20));
        testBtn.setCursor(Cursor.HAND);
        grid.add(testBtn, 1, 5);

        contentPane.getChildren().add(grid);

        // Test code
        testBtn.setOnAction(e -> {
            BuyerView buyerView = App.getInstance().buyerView;
            buyerView.setPage(buyerView.cartPage);
        });
    }
}
