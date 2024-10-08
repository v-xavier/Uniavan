<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>To-Do List</title>
</head>
<body>
    <h1>To-Do List</h1>

    <form action="/task/create" method="post">
        <input type="text" name="task" placeholder="New task" required>
        <button type="submit">Add</button>
    </form>

    <ul>
        <?php foreach ($tasks as $index => $task): ?>
            <li>
                <?= esc($task) ?>
                <a href="/task/delete/<?= $index ?>">Delete</a>
            </li>
        <?php endforeach ?>
    </ul>
</body>
</html>
